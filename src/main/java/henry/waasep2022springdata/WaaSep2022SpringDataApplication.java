package henry.waasep2022springdata;

import henry.waasep2022springdata.mapper.ListMapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WaaSep2022SpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaaSep2022SpringDataApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public ListMapper listMapper() {
        return new ListMapper();
    }
}
