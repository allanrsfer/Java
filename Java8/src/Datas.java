import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        LocalDate copaDoMundoEua = LocalDate.of(2026, Month.JUNE, 3);

        int anos = copaDoMundoEua.getYear() - hoje.getYear();

        System.out.println(anos);

        Period periodo = Period.between(hoje, copaDoMundoEua);
        System.out.println(periodo.getDays());

        LocalDate proximaCopaDoMundoEua = copaDoMundoEua.plusYears(4);
        System.out.println(proximaCopaDoMundoEua);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximaCopaDoMundoEua.format(formatador);
        System.out.println(valorFormatado);

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);
    }
}
