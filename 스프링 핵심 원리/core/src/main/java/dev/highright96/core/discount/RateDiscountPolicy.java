package dev.highright96.core.discount;

import dev.highright96.core.member.Grade;
import dev.highright96.core.member.Member;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private final int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * 10 / 100;
        }else {
            return 0;
        }
    }
}
