public class AfishaManager {
    private String[] films = new String[0];
    private int limitCount = 10;  //лимит по умолчанию

    public AfishaManager(int limitCount) {
        this.limitCount = limitCount;
    }

    public AfishaManager() {
    }

    public int getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(int newlimitCount) {
        if (newlimitCount <= 0) {
            return;
        }
        limitCount = newlimitCount;
    }


    public void save(String filmItem) {
        String[] filmList = new String[films.length + 1];

        for (int i = 0; i < films.length; i++) filmList[i] = films[i];
        filmList[filmList.length - 1] = filmItem;
        films = filmList;
    }

    public String[] findAll() {
        String[] filmlist = new String[films.length];


        int i = 0;
        for (String film : films) {
            filmlist[i] = film;
            i++;
        }
        return filmlist;
    }


    public String[] findLast() {
        int resultLength;
        int limit = getLimitCount();

        if (limit >= findAll().length) {
            resultLength = findAll().length;
        } else {
            resultLength = limit;
        }


        String[] all = findAll();
        String[] reversed = new String[resultLength];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

}
