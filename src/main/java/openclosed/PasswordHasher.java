package openclosed;


/**
 * принцип гласит: класс должен быть открыт для расширения но закрыт для модификации
 *
 */

/*
НАРУШЕНИЕ ПРИНЦИПА O! SOLID!
если нам придется внедрить новую схему хэширования,то мы изменим наш класс,что является нарушением принципа SOlID буквы О!
* public String hashPassword(String password, HashingType hashingType){
    if(HashingType.BASE64.equals(hashingType)){
        hashedPassword="hashed with Base64";
    }
    else if(HashingType.MD5.equals(hashingType)){
        hashedPassword="hashed with MD5";
    }

    return hashedPassword;
}*/

/**
 * Правильный вариант,решение через интерфейс.абстрактный класс
 */
public interface PasswordHasher {
    String hashPassword(String password);
}