package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class PlayerNumber {

    Exception exception = new Exception();

    public List<Integer> getPlayer() throws IllegalArgumentException{
        String inputNumber = Console.readLine();
        List<Integer> player = new ArrayList<>();

        for (int i = 0; i < Constant.gameNumberLength; i++) {
            player.add(Integer.parseInt(inputNumber.substring(i, i + 1)));
        }

        exception.Exception_PlayerNumberLength(inputNumber);
        return player;
    }
}