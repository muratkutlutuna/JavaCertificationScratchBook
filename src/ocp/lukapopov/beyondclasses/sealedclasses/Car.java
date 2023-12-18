package ocp.lukapopov.beyondclasses.sealedclasses;

public sealed class Car permits Ford, Renault, Fiat{//each of these classes must extend Car
                                                    //subclasses have to be made either final, sealed or non-sealed

}

final class Ford extends Car{}//final means this class cannot be further extended

non-sealed class Renault extends Car{}//non-sealed means this class can be extended by any other class

sealed class Fiat extends Car permits Uno, Punto{}//sealed means this class can be extended by only classes Uno and Punto

final class Uno extends Fiat{}
final class Punto extends Fiat{}


/**
 * @implNote Interfaces can also be made sealed
 */
sealed interface Mammal permits Cat, Dog, Eats{}//Cat, Dog and Eats could be classes or interfaces

non-sealed interface Eats extends Mammal{}
//Interfaces cannot be final!!

//classes must implement interface Mammal directly
final class Cat implements Mammal {}
final class Dog implements Eats, Mammal{}

