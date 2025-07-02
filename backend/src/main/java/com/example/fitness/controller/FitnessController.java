@RestController
public class FitnessController {

    @GetMapping("/")
    public String home() {
        return "Fitness App Home";
    }

    @GetMapping("/api")
    public String welcome() {
        return "Welcome to the Fitness App!";
    }

}
