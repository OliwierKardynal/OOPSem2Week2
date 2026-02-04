package ie.atu.sem2week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello")
public String hello()
{

    return "Hello World";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name)
    {
        return "Hello "+name;
    }
    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam Integer age){
        return "Hello " +name + " " +age;
    }
    @GetMapping("/person")
    public Person getPerson(){
        Person person = new Person("Oliwier", 21);
        return person;
    }
    @GetMapping("/calculate/{num1}/{num2}/{operation}")
    public int calculate(
            @PathVariable Integer num1,
            @PathVariable Integer num2,
            @PathVariable String operation) {

        switch (operation) {
            case "add":
                return num1 + num2;

            case "subtract":
                return num1 - num2;

            case "multiply":
                return num1 * num2;

            case "divide":
                return num1 / num2;

            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
