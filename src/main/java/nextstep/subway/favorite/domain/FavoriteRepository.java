package nextstep.subway.favorite.domain;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {

    List<Favorite> findByMemberIdOrderByIdDesc(Long memberId, Pageable pageable);
}
