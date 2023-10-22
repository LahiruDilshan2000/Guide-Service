package lk.ijse.guideservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Lahiru Dilshan
 * @created Sat 10:26 AM on 10/7/2023
 * @project nexttravel
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "_guide")
public class Guide implements SuperEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guideId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String contact;

    @Column(nullable = false)
    private Double manDayValue;

    @Column(nullable = false)
    private String guideImage;

    @Column(nullable = false)
    private String folderLocation;

    @Column(nullable = false, name = "nice_img_1")
    private String nicImage1;

    @Column(nullable = false, name = "nice_img_2")
    private String nicImage2;

    @Column(nullable = false, name = "guid_id_img_1")
    private String guideIdImage1;

    @Column(nullable = false, name = "guid_id_img_2")
    private String guideIdImage2;

    @OneToMany(mappedBy = "guide", targetEntity = GuideDates.class, cascade = CascadeType.ALL)
    private List<GuideDates> datesList;
}
