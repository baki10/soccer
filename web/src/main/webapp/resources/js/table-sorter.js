/**
 * Created by ilmir on 09.07.16.
 */
function dateSorter(a, b) {
    if (a.month < b.month) return -1;
    if (a.month > b.month) return 1;
    return 0;
}

function ampluaSorter(a, b) {

    if (getOrder(a.amplua) < getOrder(b.amplua)) return -1;
    if (getOrder(a.amplua) > getOrder(b.amplua)) return 1;
    return 0;
}

function priceSorter(a, b) {
    if (a.price < b.price) return -1;
    if (a.price > b.price) return 1;
    return 0;
}

function nameSorter(a, b) {
    if (a.playername < b.playername) return -1;
    if (a.playername > b.playername) return 1;
    return 0;
}

function getOrder(a) {
    if(a.startsWith("Вра")){
        return 1;
    }
    if(a.startsWith("Защ")){
        return 2;
    }
    if(a.startsWith("Пол")){
        return 3;
    }
    if(a.startsWith("Нап")){
        return 4;
    }
    return 0;
}