package com.company;

public class Main {

    public static void main(String[] args) {
        jdk: openjdk10
        script:
        - jdk_switcher use openjdk10
        -  do stuff with OpenJDK 10
                - wget https://github.com/sormuras/bach/raw/master/install-jdk.sh
        - chmod +x $TRAVIS_BUILD_DIR/install-jdk.sh
                - export JAVA_HOME=$HOME/openjdk11
                - $TRAVIS_BUILD_DIR/install-jdk.sh -F 11 --target $JAVA_HOME
        -  do stuff with open OpenJDK 11
    }
}
