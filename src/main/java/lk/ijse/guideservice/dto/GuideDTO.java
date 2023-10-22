package lk.ijse.guideservice.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lk.ijse.guideservice.entity.GuideDates;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Lahiru Dilshan
 * @created Sat 10:41 AM on 10/7/2023
 * @project nexttravel
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GuideDTO {

    private Integer guideId;

    private String name;

    private String address;

    private Integer age;

    private String gender;

    private String contact;

    private Double manDayValue;

    private List<byte[]> imageList;

    private List<GuideDatesDTO> datesList;

}
