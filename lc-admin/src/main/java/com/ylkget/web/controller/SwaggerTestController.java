package com.ylkget.web.controller;

import com.ylkget.system.domain.vo.MetaVo;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * SwaggerTestController
 * </p>
 * http://localhost:8090/hello/3?age=22
 * http://localhost:8090/swagger-ui/index.html
 * https://github.com/springfox/springfox
 *
 * @author joe 2021/6/3 11:40
 */
@RestController
public class SwaggerTestController {

    /**
     * @param id:
     * @return {@link java.lang.String }
     * @author joe 2021/6/3 11:43
     * http://localhost:8090/hello/2
     **/
    @ApiOperation(value = "hello", notes = "note note note s2")
    @ApiImplicitParams({@ApiImplicitParam(name = "age", value = "年龄")})
    @ApiResponses(
            @ApiResponse(code = 200, message = "OK",
                    examples = @Example({
                            @ExampleProperty(mediaType = "application/json", value = "{\"gnarf\": \"dragons\"}"),
                            @ExampleProperty(mediaType = "application/abc", value = "{\"gnarf\": \"ccc\"}")
                    })))
    @GetMapping("/hello/{id}")
    public MetaVo hello(
            @ApiParam(name = "id", value = "ID desc")
            @PathVariable String id,
            @RequestParam(value = "age", defaultValue = "20") String age
    ) {
        MetaVo m = new MetaVo();
        m.setTitle(id);
        m.setIcon(age);
        return m;
    }
}
