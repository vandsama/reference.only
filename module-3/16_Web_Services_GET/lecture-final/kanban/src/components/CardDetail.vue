<template>
  <section>
    <div class="loading" v-if="isLoading">
      <img src="../assets/ping_pong_loader.gif" />
    </div>
    <div v-else>
      <h1>{{ card.title }}</h1>
      <p>{{ card.description }}</p>
      <comments-list v-bind:comments="card.comments"></comments-list>
    </div>
  </section>
</template>

<script>
import boardService from "../services/BoardService.js";
import CommentsList from "../components/CommentsList.vue";

export default {
  name: "card-detail",
  data() {
    return {
      card: {},
      isLoading: true,
    };
  },
  components: {
    CommentsList,
  },
  created() {
    const boardId = parseInt(this.$route.params.boardID);
    const cardId = parseInt(this.$route.params.cardID);
    boardService.getCard(boardId, cardId).then((card) => {
      this.card = card;
      this.isLoading = false;
    });
  },
};
</script>
