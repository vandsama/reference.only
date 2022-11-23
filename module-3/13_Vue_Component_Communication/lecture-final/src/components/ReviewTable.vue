<template>
  <table>
    <thead>
      <tr>
        <th>Reviewer</th>
        <th>Rating</th>
        <th>Title</th>
        <th>Review</th>
        <th>Favorite</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="review in $store.getters.filteredReviews" :key="review.title">
        <td nowrap>{{ review.reviewer }}</td>
        <td>{{ review.rating }}</td>
        <td>{{ review.title }}</td>
        <td>{{ review.review }}</td>
        <td>{{ review.favorited }}</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: "review-table",
};
</script>

<style style="scoped">
th,
td {
  text-align: left;
}
td {
  padding-right: 10px;
  vertical-align: top;
}
tr:nth-child(even) {
  background-color: rgb(238, 238, 238);
}
.stars {
  display: flex;
}
</style>
