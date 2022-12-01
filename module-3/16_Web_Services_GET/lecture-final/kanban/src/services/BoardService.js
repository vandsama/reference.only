import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:3000"
});

export default {

    /**
     * Fetch all boards
     * @returns {Promise} - a promise that resolves to an Axios result. The
     *                      payload is an array of boards
     */
    getBoards() {
        return http.get('/boards');
    },

    /**
     * Fetch the story cards for a given board
     * @param {Number} boardID - the ID of the board
     * @returns {Promise} - a promise that resolves to an Axios result. The
     *                      payload is an array of cards belonging to the given
     *                      board
     */
    getCards(boardID) {
        return http.get(`/boards/${boardID}`);
    },

    /**
     * Fetch a story card
     * @param {Number} boardID - The ID of the board that owns the card
     * @param {Number} cardID - The ID of the story card to retrieve
     * @returns {Promise} - a promise that resolves to a story card
     */
    getCard(boardID, cardID) {
        // todo - fetch the specified story card
        return http.get(`/boards/${boardID}`)
            .then((response) => {
                const board = response.data;
                const card = board.cards.find(card => card.id == cardID);
                return card;
            });
    }

}
