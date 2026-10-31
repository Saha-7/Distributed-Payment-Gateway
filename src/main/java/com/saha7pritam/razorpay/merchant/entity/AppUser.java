package com.saha7pritam.razorpay.merchant.entity;

import com.saha7pritam.razorpay.common.entity.BaseEntity;
import com.saha7pritam.razorpay.common.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "app_user",
        indexes = {
                @Index(name = "idx_app_user_merchant_id", columnList = "merchant_id"),
        })
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppUser extends BaseEntity implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch=FetchType.LAZY)     // Many App users(current class) to one merchant  // FetchType.LAZY means that the associated AppUser data will be loaded lazily. But if you use Eager then it will load the associated Merchant data too.
    @JoinColumn(name="merchant_id")
    private Merchant merchant;

    @Column(unique = true, nullable = false, length = 200)
    private String email;

    @Column(nullable = false)
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    private UserRole role;


    // From UserDetails for Spring security
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(
                new SimpleGrantedAuthority("ROLE" + role)
        );
    }

    @Override
    public @Nullable String getPassword() {
        return passwordHash;
    }

    @Override
    public String getUsername() {
        return email;
    }
}
