package ch08.Quiz07;

public class DaoExample {
    public static void dbWork(DataAccessObject dao) {
        dao.search();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
}
