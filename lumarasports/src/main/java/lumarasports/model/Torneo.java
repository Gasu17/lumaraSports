package lumarasports.model;

import lombok.Data;

import java.util.UUID;
@Data
public class Torneo {

    Integer id;
    String nombre;
    String ciudad;
    double premio;
    Integer equipoCampeonId;


}
