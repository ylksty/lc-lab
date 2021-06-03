'use strict'
const path = require('path')
const port = process.env.port || process.env.npm_config_port || 80 // 端口

function resolve(dir) {
  return path.join(__dirname, dir)
}

module.exports = {
  // 如果你不需要生产环境的 source map，可以将其设置为 false 以加速生产环境构建。
  productionSourceMap: false,
  // webpack-dev-server 相关配置
  devServer: {
    host: '0.0.0.0',
    port: port,
    open: true,
    proxy: {
      // detail: https://cli.vuejs.org/config/#devserver-proxy
      [process.env.VUE_APP_BASE_API]: {
        // yg 这里转发到
        target: `http://localhost:8090`,
        changeOrigin: true,
        pathRewrite: {
          // yg 这里把 dev-api 去掉
          ['^' + process.env.VUE_APP_BASE_API]: ''
        }
      }
    },
    disableHostCheck: true
  },
  chainWebpack: config => {
    config
    .plugin('html')
    .tap(args => {
      args[0].title = '你想设置的title名字'
        return args
      })

    // set svg-sprite-loader
    config.module
      .rule('svg')
      .exclude.add(resolve('src/assets/icons'))
      .end()
    config.module
      .rule('icons')
      .test(/\.svg$/)
      .include.add(resolve('src/assets/icons'))
      .end()
      .use('svg-sprite-loader')
      .loader('svg-sprite-loader')
      .options({
        symbolId: 'icon-[name]'
      })
      .end()
  }
}