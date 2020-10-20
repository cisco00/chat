package social.chat.repository;

import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import social.chat.model.user.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
