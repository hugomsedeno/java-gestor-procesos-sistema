import java.io.IOException;

public class OrquestadorSubprocesos {

    public static void main(String[] args) {

        String miSistemaOperativo = System.getProperty("os.name").toLowerCase();
        System.out.println(miSistemaOperativo);

        String programaQueLanzaremos = null;
        if (miSistemaOperativo.contains("win")) // Windows 7, 8, 10, 11
        {
            programaQueLanzaremos = "notepad";
        } else if (miSistemaOperativo.contains("lin")) // Linux
        {
            programaQueLanzaremos = "gedit";
        } else {
            throw new RuntimeException("Sistema Operativo no soportado");
        }
        
        // Creamos el ProcessBuilder pasándole el ejecutable y el fichero a abrir
        ProcessBuilder pb = new ProcessBuilder(programaQueLanzaremos, "Bloc de notas");
        
        try {
            System.out.println("Lanzando " + programaQueLanzaremos + " ... ");
            // Aquí nace el proceso hijo
            Process procesoHijo = pb.start(); 
            System.out.println("Proceso hijo lanzado con PID: " + procesoHijo.pid());
            System.out.println("¿Sigue activo? " + procesoHijo.isAlive());
            System.out.println("Cierra el programa abierto para continuar.");
            
            int resultadoEjecucion = procesoHijo.waitFor();
            
            System.out.println("El programa ha terminado con código: " + resultadoEjecucion);
            System.out.println("¿Sigue activo? " + procesoHijo.isAlive());
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

