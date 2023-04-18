import http from 'k6/http';

export default function () {
    for (let id = 1; id <= 100000; id++) {
        http.get('http://localhost:8080/item/');
    }
}