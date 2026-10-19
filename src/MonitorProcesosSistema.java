import java.util.Optional;

public class MonitorProcesosSistema {

    public static void main(String[] args) {
        ProcessHandle miProceso = ProcessHandle.current();
        long pid = miProceso.pid();
        System.out.println("Id Proceso : " + pid);
        
        ProcessHandle.Info informacion = miProceso.info();
        Optional<String> comando = informacion.command();
        
        if (comando.isPresent()) {
            System.out.println("Comando: " + comando.get());
        }
        
        System.out.println("Comando: " + informacion.command().orElse("Desconocido"));
        
        Optional<String> usuario = informacion.user();
        if (usuario.isPresent()) {
            System.out.println("Usuario: " + usuario.get());
        }
        
        System.out.println("Usuario: " + informacion.user().orElse("Usuario Desconocido"));
        
        Optional<ProcessHandle> padreProcesoActual = miProceso.parent();
        if (padreProcesoActual.isPresent()) {
            long pidPadre = padreProcesoActual.get().pid();
            System.out.println("Id proceso padre : " + pidPadre);
            ProcessHandle.Info informacionPadre = padreProcesoActual.get().info();
            System.out.println("Comando del padre: " + informacionPadre.command().orElse("Desconocido"));
        }
        
        // Versión de Java
        System.out.println(Runtime.getRuntime().version());
        
        // Núcleos que el SO nos deja usar
        int nucleosPermitidos = Runtime.getRuntime().availableProcessors();
        System.out.println("Núcleos permitidos: " + nucleosPermitidos);
    }
}

