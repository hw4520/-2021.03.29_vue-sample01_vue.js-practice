<template>
  <div class="hello p-5">
    <h1>{{ isu }} is a man!</h1>
    <b-btn variant="secondary" @click="aaa()">변경</b-btn>

    <div>
      <router-link to="/cho">Cho로 이동하기</router-link>
    </div>

    <div>
      <ul>
        <li><router-link to="/vuex01">Vuex Sample 01</router-link></li>
        <li><router-link to="/vuex02">Vuex Sample 02</router-link></li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data: function() {
    return {
      isu: 'isu'
    }
  },
  methods: {
    aaa () {
      this.isu = 'cho'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
