package clasesyobjetos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pasajero {
    private String nombre;
    private String vuelo;
    private Date fecha;
    private int edad;
}
