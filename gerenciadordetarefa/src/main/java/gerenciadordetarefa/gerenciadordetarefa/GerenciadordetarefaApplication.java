package gerenciadordetarefa.gerenciadordetarefa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import gerenciadordetarefa.gerenciadordetarefa.Tarefa;
import gerenciadordetarefa.gerenciadordetarefa.TarefaRepository;


@SpringBootApplication
public class GerenciadordetarefaApplication {
	public static void main(String[] args) {
		SpringApplication.run(GerenciadordetarefaApplication.class, args);
	}

	@Bean
	CommandLineRunner run(TarefaRepository repository) {
		return args -> {
		};
	}
}
