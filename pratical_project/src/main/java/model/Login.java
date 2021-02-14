package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_login")
    private int idLogin;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;

    @Column(name = "last_date_login")
    private Date lastDateLogin;

    
}
