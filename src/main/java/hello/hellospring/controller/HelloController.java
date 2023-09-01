package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        //model.addAttribute("data", "hello@!!");
        return "hello_son";
    }
}

    /*
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody //http 응답 body에 직접 데이터를 추가
    //웹에서 소스 확인할 때, html 페이지가 아닌 그저 string 자료형의 데이터만.
    public String helloString(@RequestParam("name") String name){
        return "hello "+ name;
    }
    //보통 string을 반환할 때는 사용하지 않아.
    //아래와 같이
    @GetMapping("hello-api")
    @ResponseBody //httpMessageConverter에 전달하면서 json 형식으로 반환할 수 있도록
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }
    //HelloController.Hello로 접근 가능하게 하는 static class
    //여기서 알 수 있는 점, api 서버를 만들어서 제공한다고 했을 때,
    //객체를 컨트롤러 내부에 객체를 만들고 그 객체를 getter setter를 이용하여 반환
    static class Hello{
        private String name;
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

    }

    @GetMapping(
            value = "generator",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    @ResponseBody
    public @ResponseBody byte[] getImageWithMediaType() throws IOException {
        InputStream in = getClass().getResourceAsStream("사진 파일 이름");
        return IOUtils.toByteArray(in);
    }
*/

// 그런데 데이터 전송을 하려면 http를 활용해야 하는데,
// 실제로 백엔드에서 이 프로토콜을 어떻게 사용하는지.
// spring에서 어떻게 사용을 하는지.