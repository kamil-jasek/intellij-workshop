package pl.workshops.intellij.order;

import org.springframework.data.jpa.repository.JpaRepository;

interface CouponRepository extends JpaRepository<DiscountCoupon, String> {
}
