package nextstep.subway.favorite.domain;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {

    @Transactional(readOnly = true)
    List<Favorite> findByMemberIdOrderByIdDesc(Long memberId, Pageable pageable);
}
