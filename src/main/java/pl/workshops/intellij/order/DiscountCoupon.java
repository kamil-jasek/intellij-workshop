package pl.workshops.intellij.order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "discount_coupons")
class DiscountCoupon {

    @Id
    private String coupon;
    private float discount;
    private LocalDateTime validDate;
    private boolean used;
    private UUID usedBy;

    public float getDiscount() {
        return discount;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public void setUsedBy(UUID usedBy) {
        this.usedBy = usedBy;
    }

    public LocalDateTime getValidDate() {
        return validDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DiscountCoupon that)) return false;
        return coupon.equals(that.coupon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coupon);
    }
}
