import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:3000"
});

const requestConfig = {
    headers: {
        'Content-Type': 'application/json'
    }
};

export default {

    /**
     * 
     * @returns {Promise} a promise that resolves to an Axios result
     */
    getBoards() {
        return http.get('/boards');
    },

    getCards(boardID) {
        return http.get(`/boards/${boardID}`)
    },

    getCard(cardID) {
        return http.get(`/cards/${cardID}`)
    },

    addCard(card) {
        return http.post('/cards', card, requestConfig);
    },

    updateCard(card) {
        return http.put(`/cards/${card.id}`, card, requestConfig);
    },

    deleteCard(cardID) {
        return http.delete(`/cards/${cardID}`);
    },

    addBoard(board) {
        return http.post('/boards', board, requestConfig);
    },

    deleteBoard(boardID) {
        return http.delete(`/boards/${boardID}`);
    }

}
