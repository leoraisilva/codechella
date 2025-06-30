package br.com.study.codechella;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodechellaApplication {

	@GetMapping("/")
	public String HttpFuncionando () {
		return "<!DOCTYPE html>\n" +
				"<html lang=\"pt-br\">\n" +
				"<head>\n" +
				"    <meta charset=\"UTF-8\">\n" +
				"    <title>Sistema Status</title>\n" +
				"    <style>\n" +
				"        body {\n" +
				"            background-color: #121212;\n" +
				"            color: #00ff99;\n" +
				"            font-family: Arial, sans-serif;\n" +
				"            display: flex;\n" +
				"            justify-content: center;\n" +
				"            align-items: center;\n" +
				"            height: 100vh;\n" +
				"            margin: 0;\n" +
				"            flex-direction: column;\n" +
				"        }\n" +
				"        .status {\n" +
				"            font-size: 2rem;\n" +
				"            background: #1e1e1e;\n" +
				"            padding: 20px 40px;\n" +
				"            border-radius: 10px;\n" +
				"            box-shadow: 0 0 20px rgba(0, 255, 153, 0.4);\n" +
				"            animation: pulse 2s infinite;\n" +
				"        }\n" +
				"        @keyframes pulse {\n" +
				"            0% { box-shadow: 0 0 20px rgba(0, 255, 153, 0.4); }\n" +
				"            50% { box-shadow: 0 0 40px rgba(0, 255, 153, 0.8); }\n" +
				"            100% { box-shadow: 0 0 20px rgba(0, 255, 153, 0.4); }\n" +
				"        }\n" +
				"    </style>\n" +
				"</head>\n" +
				"<body>\n" +
				"    <div class=\"status\">✅ Sistema está funcionando</div>\n" +
				"    <script>\n" +
				"        console.log(\"Sistema está funcionando!\");\n" +
				"    </script>\n" +
				"</body>\n" +
				"</html>\n";
	}

	public static void main(String[] args) {
		SpringApplication.run(CodechellaApplication.class, args);
	}

}
