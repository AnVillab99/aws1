# aws-1-arep
 # BetterSpring
[![CircleCI](https://circleci.com/gh/AnVillab99/BetterSpring.svg?style=svg)](https://circleci.com/gh/AnVillab99/BetterSpring)

This laboratory intends for the students to create a basic app on AWS that receives and prints information of a http petitions directed to a heroku app.

## Getting Started

You can download a copy of the project from github.
>https://github.com/AnVillab99/aws1


### Prerequisites

You will need maven, java and heroku cli installed on the computer to run this program.


### Installing

First you need to install java and jdk.
Go to java page and download both, install them and add the paths of those folders to the enviroment variables of your pc.
For maven you download the zip archive from the maven page and unpack it on a specific folder, the you add the path to that folder on the enviroment variables
This version doesn't work on heroku, for heroku don't allow to download the driver to connecto to the db


## Running the program

To run this program on local, first you need to executo con console
> mvn clean install
>
then execute the client file on target, or on the target/classes en folder execute on cmd:
> jar cfe AWS-1.jar Client *
then:
> java -jar AWS-1.jar 

Images showing the precoess are found on the evidence pdf file.

## Design

On the emebeded pdf document is a simple description of the design pdf. 

The server :
> https://arep-lab-5.herokuapp.com

<br>
Server files:
> 

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [JAVA](https://www.java.com/es/download) - Framework
* [JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Framework

## Versioning

For the versions available, see the [tags on this repository](https://github.com/AnVillab99/BetterSpring/tags). 

## Authors

* **Andres Villamil**  [AnVillab99](https://github.com/AnVillab99)


## License

This project is under GNU General Public License - see [LICENSE](https://github.com/AnVillab99/BetterSpring/blob/master/LICENSE) to more info.

## Acknowledgments

* StackOverflow



