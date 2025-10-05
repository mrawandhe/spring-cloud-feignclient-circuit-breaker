
⚠️ **Important: Avoid Using @EnableFeignClients on the Main Application Class**
Do not annotate your main Application class with @EnableFeignClients. When this annotation is placed here, Feign clients may not integrate properly with the circuit breaker mechanism, leading to unexpected behavior or failure in fallback execution.

@SpringBootApplication
// **@EnableFeignClients(basePackages = "com.example.external")** // Avoid placing this here
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

✅ Instead, move @EnableFeignClients to a dedicated configuration class to ensure compatibility with circuit breaker features like Resilience4j.
