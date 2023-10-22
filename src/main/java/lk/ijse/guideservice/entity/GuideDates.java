package lk.ijse.guideservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Lahiru Dilshan
 * @created Thu 12:14 PM on 10/19/2023
 * @project guide-service
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "_guide_date")
public class GuideDates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date startDate;

    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "guideId", insertable = false, updatable = false)
    private Guide guide;
}
