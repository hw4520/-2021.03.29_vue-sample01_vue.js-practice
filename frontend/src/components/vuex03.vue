<template>
  <div>
    <h1>Vuex 03</h1>

    <div v-for="(user, index) in userList" :key="index">
      {{user}}
    </div>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'vuex03',
  data () {
    return {
      userList : []
    }
  },
  created() {
    this.loadUserList()
  },
  computed: {
    },
  methods: {
    loadUserList () {
      axios.get('http://127.0.0.1:9000/user/list')
      .then(res => {
          if(res.data.success === 'success') {
            this.userList = res.data.result
          } else {
            throw new Error(res)
            }
        })
      .catch(error => {
          console.log(error);
          alert(error.response.status)
      });
    }
  }
}
</script>