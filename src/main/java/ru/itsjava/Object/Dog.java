package ru.itsjava.Object;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Objects;
@Getter
@AllArgsConstructor
public class Dog {
    private final String nickname;
    private int pawsCount;

    //  public Dog(String nickname, int pawsCount) {
     //   this.nickname = nickname;
      //  this.pawsCount = pawsCount;
   // }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Dog dog = (Dog)o;
            return this.pawsCount == dog.pawsCount && Objects.equals(this.nickname, dog.nickname);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.nickname, this.pawsCount});
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", pawsCount=" + pawsCount +
                '}';
    }
}
