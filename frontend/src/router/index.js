import Vue from 'vue'
import VueRouter from 'vue-router'
import Layout from '@/layout/Layout'
import NotFound from '@/components/NotFound'

Vue.use(VueRouter)

const routes = [{
  path: '/',
  name: 'main',
  component: Layout,
  children: [{
    path: '',
    redirect: '/hello'
  }, {
    path: 'hello',
    name: 'hello',
    component: () => import('@/components/HelloWorld')
  }, {
    path: 'cho',
    name: 'cho',
    component: () => import('@/components/Cho')
  }, {
    path: 'vuex01',
    name: 'vuex01',
    component: () => import('@/components/vuex01')
  }, {
    path: 'vuex02',
    name: 'vuex02',
    component: () => import('@/components/vuex02')
  }, {
      path: 'vuex03',
      name: 'vuex03',
      component: () => import('@/components/vuex03')
  }, {
    path: '*',
    component: NotFound
  }]
}]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
