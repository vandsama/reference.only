import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '../views/Products.vue';
import ProductDetails from '../views/ProductDetail.vue';
import AddReview from "../views/AddReview.vue";

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'products',
        component: Products
    },
    {
        name: 'product-details',
        path: '/products/:id', // a token to hold the ID of the product
        component: ProductDetails
    }, {
        name: 'add-review',
        path: '/products/:id/addreview',
        component: AddReview
    }
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})

export default router
