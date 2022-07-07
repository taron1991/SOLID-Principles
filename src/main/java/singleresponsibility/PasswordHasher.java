package singleresponsibility;

/**
 *  Данный принцип гласит: проект должен быть разбит на множество других классов,которые имеют конкретные задачи,
 *  класс не должен быть слишком функциональным
 *  В данном пример у нас есть класс который занимается хэшированием пароля,мы могли бы добавить еще сохранение пароля в бд,
 *  но это нарушит первый пункт SOLID,добавлением занимается другой класс
 */
public class PasswordHasher {
        public void hashAndSavePassword(String password) {
            hashPassword();
            savePassword();
        }

        public void hashPassword()
        {
            //hashing implementation
        }
        public void savePassword()
        {
            //save to the db
        }
    }
