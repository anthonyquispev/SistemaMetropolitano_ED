package otros;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertirDate_a_String {

    public static String convertirFecha(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        String stringFecha = sdf.format(date);
        return stringFecha;
    }
}
