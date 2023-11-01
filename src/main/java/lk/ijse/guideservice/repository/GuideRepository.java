package lk.ijse.guideservice.repository;

import lk.ijse.guideservice.entity.Guide;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Lahiru Dilshan
 * @created Sat 10:35 AM on 10/7/2023
 * @project nexttravel
 **/
@Repository
public interface GuideRepository extends JpaRepository<Guide, Integer> {

    @Query(value = "from Guide g")
    List<Guide> getGuideHQLWithPageable(Pageable pageable);

    @Query(value = "select g from Guide g where g.name like ?1 " +
            "or g.address like ?2 " +
            "or g.gender like ?3 " +
            "or g.contact like ?4 ")
    List<Guide> searchByText(String t1, String t2, String t3, String t4);
}
