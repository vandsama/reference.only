import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '../views/Products.vue';
import ProductDetails from '../views/ProductDetail.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'products',
    component: Products
  },
  {
    name: 'product-details',
    path: '/products/:id', // a token to hold product ID
    component: ProductDetails
  }

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
