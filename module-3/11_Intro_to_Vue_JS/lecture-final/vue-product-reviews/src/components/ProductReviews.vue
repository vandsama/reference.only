<template>
  <div class="main">
    <h2>Product Reviews for {{ name }}</h2>
    <p class="description">{{ description }}</p>

    <div class="well-display">
      <div class="well">
        <span class="amount">{{ averageRating.toFixed(2) }}</span>
        Average Rating
      </div>
      <div class="well" v-for="n in 5" v-bind:key="n">
        <span class="amount">{{ numberOfReviewsByRating(n) }}</span>
        {{ n }} star ratings
      </div>
    </div>
    <!-- duplicate this element once for each review -->
    <div
      class="review"
      v-for="review in reviews"
      v-bind:key="review.id"
      v-bind:class="{ favorite: review.favorite === true }"
    >
      <h4>{{ review.reviewer }}</h4>
      <div class="rating">
        <img
          src="../assets/star.png"
          v-for="n in review.rating"
          v-bind:key="n"
          v-bind:title="review.rating + ' star review'"
        />
      </div>
      <h3>{{ review.title }}</h3>
      <p>{{ review.review }}</p>
      <p>Favorite? <input type="checkbox" v-model="review.favorite" /></p>
    </div>
  </div>
  <!--  -->
</template>

<script>
// model
export default {
  name: "product-reviews",
  data() {
    return {
      name: "Cigar Parties for Dummies",
      description: "Host and plan the perfect party",
      reviews: [
        {
          id: 1,
          reviewer: "mike",
          title: "great read",
          review: "how to throw an excellent party",
          rating: 5,
          favorite: false,
        },
        {
          id: 2,
          reviewer: "dave",
          title: "meh",
          review: "nothing exciting",
          rating: 3,
          favorite: false,
        },
        {
          id: 3,
          reviewer: "alex",
          title: "awesome",
          review: "i learned so much",
          rating: 5,
          favorite: false,
        },
      ],
    };
  },
  computed: {
    averageRating() {
      const sum = this.reviews.reduce(
        (sum, review) => (sum += review.rating),
        0
      );
      return sum / this.reviews.length;
    },
  },
  methods: {
    numberOfReviewsByRating(rating) {
      return this.reviews.filter((r) => r.rating === rating).length;
    },
  },
};
</script>

<style scoped>
div.main {
  margin: 1rem 0;
}

div.main div.well-display {
  display: flex;
  justify-content: space-around;
}

div.main div.well-display div.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
}

div.main div.well-display div.well span.amount {
  color: darkslategray;
  display: block;
  font-size: 2.5rem;
}

div.main div.review {
  border: 1px black solid;
  border-radius: 6px;
  padding: 1rem;
  margin: 10px;
}

div.main div.review div.rating {
  height: 2rem;
  display: inline-block;
  vertical-align: top;
  margin: 0 0.5rem;
}

div.main div.review div.rating img {
  height: 100%;
}

div.main div.review p {
  margin: 20px;
}

div.main div.review h3 {
  display: inline-block;
}

div.main div.review h4 {
  font-size: 1rem;
}

div.review.favorite {
  background-color: lightyellow;
}
</style>