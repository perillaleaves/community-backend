package perillaleaves.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import perillaleaves.shop.domain.item.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
}