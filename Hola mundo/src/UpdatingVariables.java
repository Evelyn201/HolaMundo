public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono
        salary = salary + 200;
        System.out.println(salary);

        //pension: %50 descuento
        salary = salary - 50;
        System.out.println(salary);

        // 2 horas extra $30 c/u
        // comida: $45
        salary = salary +(30*2)-45;
        System.out.println(salary);

        //actualizando cadenas de texto
        String employeeName = "Evelyn Cabrera";
        employeeName = employeeName + "Días de la Vega";
        System.out.println(employeeName);

        employeeName = "Evelyn" + employeeName;
        System.out.println("Tu nombre es: " + employeeName);

    }
}