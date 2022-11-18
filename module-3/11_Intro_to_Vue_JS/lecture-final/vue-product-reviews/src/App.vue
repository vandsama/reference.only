<template>
  <div id="app">
    <!-- step 3: add to html -->
    <product-reviews></product-reviews>
  </div>
</template>

<script>
// step 1: import component
import ProductReviews from "./components/ProductReviews.vue";

export default {
  name: "App",
  components: {
    // step 2: add as child component
    ProductReviews,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 60px auto 0 auto;
  max-width: 800px;
}
</style>
