package junit;

import org.springframework.stereotype.Component;

@Component
public class SakhaMusic implements Music{

    @Override
    public String getSong() {
        return "Мин сахабын";
    }
}
