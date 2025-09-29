package Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "TB_EMAIL")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class EmailModel {
    private String emailId;
    private String emailFrom;
    private String emailSubject;
    private String emailBody;

}
