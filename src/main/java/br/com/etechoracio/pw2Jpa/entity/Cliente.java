package br.com.etechoracio.pw2Jpa.entity;

import br.com.etechoracio.pw2Jpa.enums.TipoDocumentoEnum;
import br.com.etechoracio.pw2Jpa.enums.TipoTelefoneEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "TBL_CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_CLIENTE")
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

    @Column (name = "TX_DOCUMENTO")
    private String documento;

    @Enumerated (EnumType.STRING)
    @Column(name = "TX_TIPO_DOCUMENTO")
    private TipoDocumentoEnum tipoDocumento;

    @Column (name = "TX_AREA_FONE")
    private String areaFone;

    @Enumerated (EnumType.STRING)
    @Column (name = "TX_FONE")
    private TipoTelefoneEnum tipoFone;

    @Column (name = "TX_EMAIL")
    private String email;
}
