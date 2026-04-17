package NivelIntermedio;

import java.util.ArrayList;

public class RegistroEmpleados {
    private ArrayList<Empleado> empleados;

    public RegistroEmpleados() {
        this.empleados = new ArrayList<>();
    }

    public void agregar(Empleado empleado) {
        empleados.add(empleado);
    }

    public Empleado buscarPorId(String id) {
        for (Empleado e : empleados) {
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Empleado> listar() {
        return empleados;
    }
}

